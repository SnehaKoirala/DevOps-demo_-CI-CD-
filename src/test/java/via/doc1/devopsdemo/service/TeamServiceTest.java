package via.doc1.devopsdemo.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import via.doc1.devopsdemo.model.Task;
import via.doc1.devopsdemo.model.TeamMember;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for TeamService
 */
@ExtendWith(MockitoExtension.class)
public class TeamServiceTest {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
   
    @InjectMocks
    private TeamService teamService;

    @Test
    public void getTeamMemberTest() throws Exception {
        TeamMember member = teamService.getTeamMember("Member1");
        assertNotNull(member);
        assertEquals("Chase", member.getName());
        assertEquals("chase@pawpatrol.org", member.getEmail());
    }

    @Test
    public void getTasksTest() throws Exception {
        List<Task> tasks = teamService.getTasks("Member1");
        assertNotNull(tasks);
        assertEquals(3, tasks.size());
        assertEquals("Task1", tasks.get(0).getId());
    }

    @Test
    public void getTaskTest() throws Exception {
        Task task = teamService.getTask("Member1", "Task1");
        assertNotNull(task);
        assertEquals("IoT Pipeline", task.getName());
    }

    @Test
    public void getTaskForNonExistingMemberTest() throws Exception {
        Task task = teamService.getTask("UnknownMMember", "Task1");
        assertNull(task);
    }

    @Test
    public void getTaskForNonExistingTaskTest() throws Exception {
        Task task = teamService.getTask("Member1", "UnknownTask");
        assertNull(task);
    }

    @Test
    public void getNonExistingTeamMemberTest(){
        TeamMember member = teamService.getTeamMember("UnknownMember");
        assertNull(member);
    }

    @Test
    public void getTasksForNonExistingMemberTest(){
        List<Task> tasks = teamService.getTasks("UnknownMember");
        assertNull(tasks);
    }
}
