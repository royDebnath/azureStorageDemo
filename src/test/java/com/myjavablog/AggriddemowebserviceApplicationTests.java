package com.myjavablog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AggriddemowebserviceApplicationTests {

	@Test
	public void contextLoads() {
	}

}

/**
 * @author anup

@Entity
@Table(name = "TODO")
public class Todo implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TASK_NAME")
    private String taskName;
    @Column(name = "TASK_DESC")
    private String taskDesc;
    @Column(name = "STATUS")
    private String status;

    public Todo() {
        super();
    }

    public Todo(Long id, String taskName, String taskDesc, String status) {
        super();
        this.id = id;
        this.taskName = taskName;
        this.taskDesc = taskDesc;
        this.status = status;
    }

    //Setters and Getters
}
class StateTest
{
    public static void main(String[]args)
    {
        SessionnFactory factory=new Configuration().configure("hibewrnate.cfg.xml").buildSessionFactpry();
        Sessiion session1=factory.openSession();
        Todo e1=new Todo(1l, "Wakeup", "Wake up at 7AM", "DONE"); //Entity bean in Transient sate.

        Transaction tx1=session1.beginTransaction();
        session1.save(e1); //Entity bean in persistent state
        e1.setTaskName("Running"); //Will effect in db
        tx1.commit();
        session1.close();
        //Now e1 in ditached state
        e1.setStream("Webservices"); //Will not effect in db

    }
}

    public void savePost(long authorId, String text) {
        Post p = new Post();
        p.setText(text);

        // No SELECT query here.
        // Existence of Author is ensured by foreign key constraint on Post.
        p.setAuthor(s.load(Author.class, authorId));

        s.save(p);
    }
}*/