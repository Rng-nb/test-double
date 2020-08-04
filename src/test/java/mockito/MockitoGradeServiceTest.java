package mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockitoGradeServiceTest {
    @Test
    void souldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        GradeSystem gradeSystem = mock(GradeSystem.class);
        GradeService gradeService = new GradeService(gradeSystem);
        when(gradeSystem.gradesFor(1)).thenReturn(Arrays.asList(80.0,90.0,100.0));
        double result = gradeService.calculateAverageGrades(1);
        Assertions.assertEquals(90.0, result);
    }
}
