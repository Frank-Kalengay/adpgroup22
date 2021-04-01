/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpgroup22;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DELL
 */
public class UniversityTest {
    
   private University Student1;
   private University Student2;
   private University Student3;
   
   
    
    @BeforeEach
    
    public void setUp() 
    {
        Student1= new University ();
        Student2=Student3;
        }
    

    
    public void testEquality()
    {
         assertEquals(Student3,Student2);
    }
     public void testIdentity()
    {
         assertEquals(Student3,Student2);
    }
    
}
