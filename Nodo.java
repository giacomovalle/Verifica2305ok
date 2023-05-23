// classe parametrica Nodo: l’attributo "info" ha tipo generico T

public class Nodo<T> {
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
