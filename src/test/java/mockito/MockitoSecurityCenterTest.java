package mockito;

import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MockitoSecurityCenterTest {

    DoorPanel doorPanel;
    SecurityCenter securityCenter;

    @BeforeEach
    void setUp() {
        doorPanel = mock(DoorPanel.class);
        securityCenter = new SecurityCenter(doorPanel);
    }
    @Test
    void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
        verify(doorPanel).close();
    }
}
