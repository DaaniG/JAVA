package es.uned.lsi.eped.DataStructures;

public class Test {

	
	  public static void main(String [] args) throws Exception{
		  		  
		/* Test operaciones sobre listas */ 
		System.out.println("Test de operaciones sobre listas");
		List<Integer> L = new List<Integer>();
		L.insert(1, 1);
		L.insert(2, 2);
		L.insert(3, 3);
		L.insert(4, 4);
		L.insert(5, 5);
		L.insert(6, 6);
		L.set(5, 10);
		L.insert(10,1);
		L.insert(11,2);
		L.insert(19,9);
		System.out.print("Recorrido copia de la lista mediante iterador: ");
		ListIF<Integer> copyList = new List<Integer>(L);
		System.out.println(copyList.size()+" elementos.");
		IteratorIF<Integer> iteratorListCopy = copyList.iterator();
		while(iteratorListCopy.hasNext()){
			  System.out.print(iteratorListCopy.getNext()+" ");
		}
		System.out.println();		  
		System.out.println("Elemento en la posicion 2: "+L.get(2));		  
		System.out.println("Tamaño de la lista: "+L.size());	
		System.out.println("Eliminar elemento en la posicion 9: ");			  
		L.remove(9);
		IteratorIF<Integer> iteratorList = L.iterator();
		while(iteratorList.hasNext()){
			  System.out.print(iteratorList.getNext()+" ");
		}
		System.out.println();		  
		System.out.println("Eliminar elemento en la posicion 1: ");			  
		L.remove(1);
		iteratorList = L.iterator();
		while(iteratorList.hasNext()){
			  System.out.print(iteratorList.getNext()+" ");
		}
		System.out.println();		  
		System.out.println("Eliminar elemento en la posicion 4: ");			  
		L.remove(4);
		iteratorList = L.iterator();
		while(iteratorList.hasNext()){
			System.out.print(iteratorList.getNext()+" ");
		}
		System.out.println();		  
		System.out.println("La lista contiene el elemento 2? "+L.contains(2));
		System.out.println("La lista contiene el elemento 0? "+L.contains(0));		  
		System.out.println("Recorrer la lista mediante iterador: ");		  		  
		iteratorList = L.iterator();
		while(iteratorList.hasNext()){
			System.out.print(iteratorList.getNext()+" ");
		}
		System.out.println();		  
		System.out.println("Tamaño de la lista: "+L.size());	
		System.out.println("Aplicar clear");
		L.clear();
		System.out.println("isEmpty? "+L.isEmpty());
		iteratorList = L.iterator();
		while(iteratorList.hasNext()){
			System.out.print(iteratorList.getNext()+" ");
		}
		
		/*Test operaciones sobre pilas*/
		System.out.println("Test de operaciones sobre pilas");
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println("Recorrido mediante iterador:");		
		IteratorIF<Integer> iteratorStack = stack.iterator();
		while(iteratorStack.hasNext()){
			System.out.print(iteratorStack.getNext()+" ");
		}
		System.out.println();
		System.out.println("Tamaïño pila:"+stack.size());		
		System.out.println("contains(3):"+stack.contains(3));
		System.out.println("contains(9):"+stack.contains(9));		
		System.out.println("Recorrido copia de la pila mediante iterador:");		
		StackIF<Integer> copyStack = new Stack<Integer>(stack);
		IteratorIF<Integer> iteratorCopyStack = copyStack.iterator();
		while(iteratorCopyStack.hasNext()){
			System.out.print(iteratorCopyStack.getNext()+" ");
		}
		System.out.println();
		System.out.println("contains(3)? "+stack.contains(3));
		System.out.println("contains(7)? "+stack.contains(7));
		System.out.println("Aplicar getTop y pop:");		
		System.out.println("Cima: "+stack.getTop());
		stack.pop();
		System.out.println("Cima: "+stack.getTop());
		stack.pop();
		System.out.println("Cima: "+stack.getTop());
		stack.pop();
		System.out.println("Cima: "+stack.getTop());
		stack.pop();
		System.out.println("Cima: "+stack.getTop());
		stack.pop();
		System.out.println("isEmpty? "+stack.isEmpty());
		
		/*Test operaciones colas*/
		System.out.println("Test de operaciones sobre colas");
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		System.out.println("Recorrido mediante iterador:");
		IteratorIF<Integer> iteratorQueue = queue.iterator();
		while(iteratorQueue.hasNext()){
			System.out.print(iteratorQueue.getNext()+" ");
		}
		System.out.println();
		System.out.println("Tamaño de la cola: "+queue.size);
		System.out.println("contains(3)?: "+queue.contains(3));
		System.out.println("contains(9)?: "+queue.contains(9));
		System.out.println("Recorrido copia de la cola mediante iterador:");
		QueueIF<Integer> copyQueue = new Queue<Integer>(queue);
		IteratorIF<Integer> iteratorCopyQueue = copyQueue.iterator();
		while(iteratorCopyQueue.hasNext()){
			System.out.print(iteratorCopyQueue.getNext()+" ");
		}
		System.out.println();
		System.out.println("Aplicar getFirst y dequeue:");
		System.out.println(queue.getFirst());
		queue.dequeue();
		System.out.println(queue.getFirst());
		queue.dequeue();
		System.out.println(queue.getFirst());
		queue.dequeue();
		System.out.println(queue.getFirst());
		queue.dequeue();
		System.out.println(queue.getFirst());
		queue.dequeue();
		System.out.println("isEmpty?: "+queue.isEmpty());
		
		/*Test operaciones sobre arboles binarios*/
		/*
		Ejemplo extraido de Wikipedia:
		Link: https://es.wikipedia.org/wiki/Recorrido_de_%C3%A1rboles
		*/
		//
		System.out.println("Test de operaciones sobre Ã¡rboles binarios");
		BTree<String> btree = new BTree<String>();
		btree.setRoot("F");
		//construccion hijo izquierdo
		BTree<String> izq = new BTree<String>();
		izq.setRoot("B");
		BTree<String> izqizq = new BTree<String>();
		izqizq.setRoot("A");
		izq.setLeftChild(izqizq);
		BTree<String> izqder = new BTree<String>();
		izqder.setRoot("D");
		BTree<String> izqderizq = new BTree<String>();
		izqderizq.setRoot("C");
		izqder.setLeftChild(izqderizq);
		BTree<String> izqderder = new BTree<String>();
		izqderder.setRoot("E");
		izqder.setRightChild(izqderder);
		izq.setRightChild(izqder);
		btree.setLeftChild(izq);
		//construccion hijo derecho
		BTree<String> der = new BTree<String>();
		der.setRoot("G");
		BTree<String> derder = new BTree<String>();
		derder.setRoot("I");
		BTree<String> derderizq = new BTree<String>();
		derderizq.setRoot("H");
		derder.setLeftChild(derderizq);
		der.setRightChild(derder);
		btree.setRightChild(der);
		
		//recorrido en preorden
		System.out.print("Preorden: ");
		IteratorIF<String> iterPreorderBTree = btree.iterator(BTree.IteratorModes.PREORDER);
		while(iterPreorderBTree.hasNext()){
			System.out.print(iterPreorderBTree.getNext()+" ");
		}
		System.out.println();
		
		//recorrido en inorden
		System.out.print("Inorden: ");
		IteratorIF<String> iterInorderBTree = btree.iterator(BTree.IteratorModes.INORDER);
		while(iterInorderBTree.hasNext()){
			System.out.print(iterInorderBTree.getNext()+" ");
		}
		System.out.println();
		
		//recorrido en postorden
		System.out.print("Postorden: ");
		IteratorIF<String> iterPostOrderBTree = btree.iterator(BTree.IteratorModes.POSTORDER);
		while(iterPostOrderBTree.hasNext()){
			System.out.print(iterPostOrderBTree.getNext()+" ");
		}
		System.out.println();		
		
		//recorrido en profundidad LR
		System.out.print("Breadth LR: ");
		IteratorIF<String> iterBreadthLRBTree = btree.iterator(BTree.IteratorModes.BREADTH);
		while(iterBreadthLRBTree.hasNext()){
			System.out.print(iterBreadthLRBTree.getNext()+" ");
		}
		System.out.println();		

		//recorrido en profundidad RL
		System.out.print("Breadth RL: ");
		IteratorIF<String> iterBreadthRLBTree = btree.iterator(BTree.IteratorModes.RLBREADTH);
		while(iterBreadthRLBTree.hasNext()){
			System.out.print(iterBreadthRLBTree.getNext()+" ");
		}
		System.out.println();
		
		/*Test operaciones sobre arboles generales*/
		System.out.println("Test de operaciones sobre Ã¡rboles generales");
		GTreeIF<Integer> gtree = new GTree<Integer>();
		gtree.setRoot(1);
		//hijo 1
		GTreeIF<Integer> gtree1 = new GTree<Integer>();
		gtree1.setRoot(2);
		GTreeIF<Integer> gtree1tree1 = new GTree<Integer>();
		gtree1tree1.setRoot(5);
		//obtener posicion donde ubicar un nuevo hijo: numero de hijos + 1
		int sizeTree1 = gtree1.getChildren().size()+1;
		gtree1.addChild(sizeTree1, gtree1tree1);
		GTreeIF<Integer> gtree1tree2 = new GTree<Integer>();
		gtree1tree2.setRoot(6);
		sizeTree1 = gtree1.getChildren().size()+1;
		gtree1.addChild(sizeTree1, gtree1tree2);
		int sizeTree = gtree.getChildren().size()+1;
		gtree.addChild(sizeTree,gtree1);
		//hijo 2
		GTreeIF<Integer> gtree2 = new GTree<Integer>();
		gtree2.setRoot(3);
		sizeTree = gtree.getChildren().size()+1;
		gtree.addChild(sizeTree,gtree2);
		//hijo 3
		GTreeIF<Integer> gtree3 = new GTree<Integer>();
		gtree3.setRoot(4);
		GTreeIF<Integer> gtree3tree1 = new GTree<Integer>();
		gtree3tree1.setRoot(7);
		int sizeTree3 = gtree3.getChildren().size()+1;
		gtree3.addChild(sizeTree3,gtree3tree1);
		sizeTree = gtree.getChildren().size()+1;
		gtree.addChild(sizeTree,gtree3);
		
		//operaciones sobre arboles unarios
		System.out.println("Numero de nodos: "+gtree.size());
		System.out.println("contains(3): "+gtree.contains(3));
		System.out.println("contains(9): "+gtree.contains(9));
		System.out.println("isEmpty?: "+gtree.isEmpty());
		System.out.println("isLeaf(1)?: "+gtree.isLeaf());
		System.out.println("isLeaf(3)?: "+gtree2.isLeaf());
		
		//recorridos
		
		//recorrido en preorden
		System.out.print("Preorden: ");
		IteratorIF<Integer> iterPreorderGTree = gtree.iterator(GTree.IteratorModes.PREORDER);
		while(iterPreorderGTree.hasNext()){
			System.out.print(iterPreorderGTree.getNext()+" ");
		}
		System.out.println();
		
		//recorrido en postorden
		System.out.print("Postorden: ");
		IteratorIF<Integer> iterPostorderGTree = gtree.iterator(GTree.IteratorModes.POSTORDER);
		while(iterPostorderGTree.hasNext()){
			System.out.print(iterPostorderGTree.getNext()+" ");
		}
		System.out.println();
		
		//recorrido en profundidad
		System.out.print("Breadth: ");
		IteratorIF<Integer> iterBreadthGTree = gtree.iterator(GTree.IteratorModes.BREADTH);
		while(iterBreadthGTree.hasNext()){
			System.out.print(iterBreadthGTree.getNext()+" ");
		}
		System.out.println();
	 }

}
