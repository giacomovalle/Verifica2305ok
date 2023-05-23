
import java.util.*;

public class Iteratore<T> implements Iterator<T> {
 Nodo<T> nodo;
 
public Iteratore(Nodo<T> nodo) {
 this.nodo = nodo;
}

public boolean hasNext(){
 if (nodo == null)
   return false;
 else
     return true;
}

public T next() throws NoSuchElementException {
 if (nodo == null)
   throw new NoSuchElementException();

 T info = nodo.getInfo();
 nodo = nodo.getLink();
 return info;
}

public void remove() throws UnsupportedOperationException {
 throw new UnsupportedOperationException();
}
}
