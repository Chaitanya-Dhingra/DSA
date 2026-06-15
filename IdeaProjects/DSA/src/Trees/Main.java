package Trees;
import java.util.*;

public class Main {
    static void main() {
        Scanner sc= new Scanner(System.in);
        binaryTree tree= new binaryTree();
        tree.populate(sc);
        //tree.display();
        tree.prettyDisplay();
    }
}
