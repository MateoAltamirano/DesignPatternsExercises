package composite;

public class Main {

	public static void main(String[] args) {
		
		Composite subtask1 = new Composite("Subtask 1",0);
		subtask1.add(new Item("Item 1", 5));
		subtask1.add(new Item("Item 2",5));
		
		Composite subtask2 = new Composite("Subtask 2",0);
		subtask2.add(new Item("Item 3", 2));
		subtask2.add(new Item("Item 4",3));
		
		Composite subtask3 = new Composite("Subtask 3",0);
		subtask3.add(new Item("Item 5", 4));
		subtask3.add(new Item("Item 6",6));
		
		Composite subtask4 = new Composite("Subtask 4",0);
		subtask4.add(new Item("Item 7", 1));
		subtask4.add(new Item("Item 8",4));
		
		Composite task1 = new Composite("Task 1",0);
		task1.add(subtask1);
		task1.add(subtask2);
		
		Composite task2 = new Composite("Task 2",0);
		task2.add(subtask3);
		task2.add(subtask4);
		
		Composite userStory = new Composite("User Story",0);
		userStory.add(task1);
		userStory.add(task2);
		System.out.println();
		userStory.print();
	}
	
}
