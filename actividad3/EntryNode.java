package actividad3;

public class EntryNode {
	    private String name;
	    private int id;

	    public EntryNode(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getId() {
	        return id;
	    }

	    @Override
	    public String toString() {
	        return "Student [name=" + name + ", id=" + id + "]";
	    }
	}
