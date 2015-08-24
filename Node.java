import java.io.File;
import java.nio.file.Files;
import java.util.*;
import net.sf.json.*;

public class Node {

	public String value;
	public Node left;
	public Node right;

	public Node(String value) {
		this.value = value;
	}

	public Node(JSONObject json) {
		value = (String)json.get("value");
		if (json.get("left") != null) {
			left = new Node((JSONObject)json.get("left"));
		}
		if (json.get("right") != null) {
			right = new Node((JSONObject)json.get("right"));
		}
	}

	public void traverseAndPrint() {
		if (left != null) {
			left.traverseAndPrint();
		}
		System.out.println(value);
		if (right != null) {
			right.traverseAndPrint();
		}
	}

	public List<Node> toList() {
		// TODO: write this
		ArrayList<Node> ListNode = new ArrayList<Node>();
		
		ListNode.add=({"Gala"});
		System.out.println(ListNode);
		
		return ListNode;
	}

	public Map toMap() {
		// TODO: write this
		return new HashMap<Node, String>();
	}

	public boolean isAncestorOf(Node destination) {
		// TODO: write this
		return false;
	}

	public static void main(String[] args) {
		// open and read the file
		File jsonFile = new File("tree.json");
		String jsonString = "";
		try {
			jsonString = new String(Files.readAllBytes(jsonFile.toPath()));
		} catch (Exception e) {
			// this try-catch block is required for compilation, but let's just hope it isn't actually necessary at runtime
		}

		// build the tree and display its contents
		JSONObject jsonObject = JSONObject.fromObject(jsonString);
		Node node = new Node(jsonObject);
		node.traverseAndPrint();

		// test functionality of toList()
		List<Node> nodeList = node.toList();
		assert nodeList.size() == 4;
		assert nodeList.get(0).value.equals("Gala");
		assert nodeList.get(1).value.equals("Ambrosia");
		assert nodeList.get(2).value.equals("Fuji");
		assert nodeList.get(3).value.equals("Granny Smith");

		// test functionality of toMap()
		Map nodeMap = node.toMap();
		assert ((Node)nodeMap.get("Gala")).right == nodeMap.get("Ambrosia");

		// test functionality of isAncestorOf()
		assert node.isAncestorOf(node.left);
		assert node.isAncestorOf(node.left.right);
		assert node.isAncestorOf(node.right);
		assert !node.isAncestorOf(new Node("Other"));
	}
}
