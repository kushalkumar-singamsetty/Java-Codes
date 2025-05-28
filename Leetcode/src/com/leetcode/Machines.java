package com.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Machines {

    public static int getMinMachines(int[] start, int[] end) {
        // Combine start and end times into a list of Task objects
        List<Task> tasks = new ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            tasks.add(new Task(start[i], end[i]));
        }
        
        // Sort the tasks based on their start times
        tasks.sort(Comparator.comparingInt(Task::getStartTime));
        
        List<List<Task>> machines = new ArrayList<>();
        
        for (Task task : tasks) {
            // Check if the task can be scheduled on any existing machine
            boolean scheduled = false;
            for (List<Task> machine : machines) {
                // Check if the task overlaps with any task scheduled on the current machine
                if (machine.stream().noneMatch(t -> t.getEndTime() > task.getStartTime() && t.getStartTime() < task.getEndTime())) {
                    machine.add(task);
                    scheduled = true;
                    break;
                }
            }
            // If the task couldn't be scheduled on any existing machine, create a new machine
            if (!scheduled) {
                List<Task> newMachine = new ArrayList<>();
                newMachine.add(task);
                machines.add(newMachine);
            }
        }
        
        // The number of machines required is the size of the machines list
        return machines.size();
    }

    public static void main(String[] args) {
        int[] start = {2, 2, 2, 2};
        int[] end = {5, 5, 5, 5};

        System.out.println(getMinMachines(start, end)); // Output: 4
    }

    static class Task {
        private int startTime;
        private int endTime;

        public Task(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public int getStartTime() {
            return startTime;
        }

        public int getEndTime() {
            return endTime;
        }
    }
}