package via.doc1.devopsdemo.model;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testTask() {
        Task task = new Task();
        task.setId("1");
        task.setName("Task 1");
        task.setDescription("Description 1");
        System.out.println(task);

        Task task2 = new Task("2", "Task 2", "Description 2");
        System.out.println(task2);
    }

    @Test
    public void testEquals() {
        Task task = new Task("1", "Task 1", "Description 1");
        Task task2 = new Task("1", "Task 2", "Description 2");
        System.out.println(task.equals(task2));
    }

    @Test
    public void testNotEquals() {
        Task task = new Task("1", "Task 1", "Description 1");
        Task task2 = new Task("2", "Task 2", "Description 2");
        System.out.println(task.equals(task2));
    }

    @Test
    public void testNotEqualsNull() {
        Task task = new Task("1", "Task 1", "Description 1");
        System.out.println(task.equals(null));
    }

    @Test
    public void testNotEqualsDifferentClass() {
        Task task = new Task("1", "Task 1", "Description 1");
        System.out.println(task.equals(new Object()));
    }

    @Test
    public void testHashCode() {
        Task task = new Task("1", "Task 1", "Description 1");
        System.out.println(task.hashCode());
    }

    @Test
    public void testHashCodeNull() {
        Task task = new Task();
        System.out.println(task.hashCode());
    }

}