package imagineARpgGame;

import java.util.ArrayList;
import java.util.List;

public class Room {
	// rooms in the game
	private int number;
	private String name = null;
	private List<String> desc = new ArrayList<String>();
	// what rooms are linked to what other rooms
	// if you are standing in room 1, and wanna go south
	// it will take it to room 2
	private List<String> exits = new ArrayList<String>();
	
	// any npc that is in a room that has been constructed will show up here
	// every room now will have a list of npcs
	private List<NPC> npcs = new ArrayList<NPC>();
	
	// have an list with all the items in the room
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public Room(int x) {
		// init room instance with its number
		number = x;
	}
	
	public void setName(String roomName) {
		this.name = roomName;
	}
	
	public void setNumber(int roomNumber) {
		this.number = roomNumber;
	}
	
	public void addDescription(String description) {
		desc.add(description);
	}	
	
	public void addLinkingExits(String exit) {
		exits.add(exit);
		// the first word of that exit is the name of the exit
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<String> getExits(){
		return exits;
	}
	
	public int getArrayDescSize() {
		return desc.size();
	}
	
	public int getArrayExitsSize() {
		return exits.size();
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public List<String> getDesc() {
		return desc;
	}
	
	public String getExitsbyIndex(int i) {
		return exits.get(i);
	}
	
	public List<NPC> getNpcs() {
		return this.npcs;
	}
	
	public ArrayList<Item> getItems() {
		return this.items;
	}

}
