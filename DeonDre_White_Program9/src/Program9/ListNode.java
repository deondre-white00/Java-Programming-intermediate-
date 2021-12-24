package Program9;

//Fig. 21.3: List.java
//ListNode and List class declarations.


//class to represent one node in a list
class ListNode<E>
{
// package access members; List can access these directly
E data; // data for this node
ListNode<E> nextNode; // reference to the next node in the list

// constructor creates a ListNode that refers to object
ListNode(E object)
{
	   this(object, null);
}

// constructor creates ListNode that refers to the specified
// object and to the next ListNode
ListNode(E object, ListNode<E> node)
{
   data = object;    
   nextNode = node;  
} 

// return reference to data in node
E getData()
{
	   return data;
}

// return reference to next node in list
ListNode<E> getNext()
{
	   return nextNode;
}
} 

