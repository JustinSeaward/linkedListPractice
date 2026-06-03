package UndoRedo;

/**
 * Implement an application that supports undo/redo functionality. User a linked list to maintain a sequence of states
 * Each statechange is stored as a node in the list, allowing for the easy navigation
 * 1<>2<>3<>4<>5
 * 1<>2<>3<>4
 * 1<>2<>3
 * 1<>2
 * 1<>2<>3
 * 1<>2<>3<>4
 * 1<>2<>3<>4<>5
 */

public class UndoRedoManager<T> {

    private class Node {
        private T state;
        private Node next;
        private Node previous;

        private Node (T state){
            this.state = state;
        }

    }

    private Node currentState;

    // Undo operation
    public T Undo(){
        if (currentState == null){
            System.out.println("No state to undo.");
            return null;
        }
        Node previousState = currentState.previous;
        if(previousState == null){
            System.out.println("Reached the initial start state.");
        } else {
            currentState = previousState;
        }
        return currentState.state;
    }

    // Perform an operation
    public void addState(T newState) {
        // Create a new node for the new task
        Node newNode = new Node(newState);

        // Setting the link for the new node
        newNode.previous = currentState;
        newNode.next = null;

        // Updating the next link for the current state
        if(currentState != null){
            currentState.next = newNode;
        }
        // Updating the current state to the new state
        currentState = newNode;
    }

    // Assignment: Implement the Redo method

    public T Redo(){
        if(currentState == null){
            System.out.println("No state to redo");
            return null;
        }
        Node nextState = currentState.next;
        if(nextState == null){
            System.out.println("Reached the end state.");
        } else {
            currentState = nextState;
        }
        return currentState.state;
    }


    public static void main(String[] args){
        UndoRedoManager undoRedoManager = new UndoRedoManager();
        undoRedoManager.addState("Wake up from bed");
        undoRedoManager.addState("Brush teeth");
        undoRedoManager.addState("Take shower");
        undoRedoManager.addState("Go to class");

        System.out.println("Undo");
        System.out.println("Current state: " + undoRedoManager.currentState.state);
        undoRedoManager.Undo();
        System.out.println("Current state: " + undoRedoManager.currentState.state);
        undoRedoManager.Undo();
        System.out.println("Current state: " + undoRedoManager.currentState.state);
        undoRedoManager.Undo();
        System.out.println("Current state: " + undoRedoManager.currentState.state);
        undoRedoManager.Undo();
        System.out.println("Current state: " + undoRedoManager.currentState.state + "\n");

        System.out.println("Redo");
        undoRedoManager.Redo();
        System.out.println("Current state: " + undoRedoManager.currentState.state);
        undoRedoManager.Redo();
        System.out.println("Current state: " + undoRedoManager.currentState.state);
        undoRedoManager.Redo();
        System.out.println("Current state: " + undoRedoManager.currentState.state);
        undoRedoManager.Redo();
        System.out.println("Current state: " + undoRedoManager.currentState.state);
    }
}