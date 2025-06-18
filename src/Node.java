public class Node {
    Client client;
    Node next;

    public Node(Client client) {
        this.client = client;
        this.next = null;
    }
}
