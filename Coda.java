
// classe parametrica Nodo: l’attributo "info" ha tipo generico T
class Nodo<T> {
 private T info;
 private Nodo<T> link;
 
public Nodo(T info) {
 this.info = info;
 link = null;
}

public void setInfo(T info) {
 this.info = info;
}

public T getInfo() {
 return info;
}

protected void setLink(Nodo<T> link) {
 this.link = link;
}

public Nodo<T> getLink(){
 return link;
}
}

// classe parametrica Coda: gli attributi "head" e "tail" hanno come tipo generico la classe parametrica Nodo (Nodo<T>)
public class Coda<T> {
 private Nodo<T> head;
 private Nodo<T> tail;

public Coda() {
 head = null;
 tail = null;
}

private Nodo<T> creaNodo(T info, Nodo<T> link) {
 Nodo<T> p = new Nodo<T>(info);
 
 p.setLink(link);
 return p;
}

// inserimento di un elemento di tipo parametrico nella coda
public void enqueue(T info) {
 Nodo<T> p = creaNodo(info, null);
 
 if (head == null) {
   tail = p;
  head = tail;
 }
else {
      tail.setLink(p);
      tail = p;
    }
}

// estrazione di un elemento di tipo parametrico dalla coda
public T dequeue() {
 Nodo<T> p;

 if (head == null)
   return null;
 p = head;
 head = head.getLink();
 if (head == null)
   tail = null;
 return p.getInfo();
}

public Iteratore<T> getIteratore() {
 Iteratore<T> i = new Iteratore<T>(head);
 return i;
}
}
