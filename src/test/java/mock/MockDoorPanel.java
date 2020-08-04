package mock;

public class MockDoorPanel extends DoorPanel{
    public boolean isClosed = false;

    @Override
    void close() {
        isClosed = true;
        System.out.println("The Mock Close is called");
    }
}
