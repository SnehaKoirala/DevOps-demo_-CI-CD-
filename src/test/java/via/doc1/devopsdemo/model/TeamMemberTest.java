package via.doc1.devopsdemo.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

public class TeamMemberTest {
    public MockMvc mockMvc;

    @MockBean
    private TeamMember teamMember1 = new TeamMember("Member1", "John Doe", "test@test.com", null);

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Test
    public void testTeamMember() {
        teamMember1 = new TeamMember("Member1", "John Doe", "test@test.dk", null);
        List tasks = new ArrayList();
        tasks.add(new Task("Task1", "IoT Pipeline", "Create CD pipeline for IoT component"));
        tasks.add(new Task("Task2", "IoT Pipeline", "Create CD pipeline for IoT component"));
        tasks.add(new Task("Task3", "IoT Pipeline", "Create CD pipeline for IoT component"));
        teamMember1.setTasks(tasks);

    }

    @Test
    public String testGetEmail() {
        return teamMember1.getEmail();
    }

    @Test
    public void testSetEmail() {
        teamMember1.setEmail("test1@test.dk");
    }

    @Test
    public String testGetId() {
        return teamMember1.getId();
    }

    @Test
    public void testSetId() {
        teamMember1.setId("Member2");
    }

    @Test
    public String testGetName() {
        return teamMember1.getName();
    }

    @Test
    public void testSetName() {
        teamMember1.setName("Jane Doe");
    }

    @Test
    public List<Task> testGetTasks() {
        return teamMember1.getTasks();
    }

    @Test
    public void testSetTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Task4", "IoT Pipeline", "Create CD pipeline for IoT component"));
        tasks.add(new Task("Task5", "IoT Pipeline", "Create CD pipeline for IoT component"));
        tasks.add(new Task("Task6", "IoT Pipeline", "Create CD pipeline for IoT component"));
        teamMember1.setTasks(tasks);
    }

    @Test
    public void testToString() {
        System.out.println(teamMember1.toString());
    }

}