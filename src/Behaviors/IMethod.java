package Behaviors;

public interface IMethod<E> {
    void add(E obj);
    void remove(E obj);
    void update(E newObj,E oldObj);
    E search(int licencePlate);
    void show();
}
