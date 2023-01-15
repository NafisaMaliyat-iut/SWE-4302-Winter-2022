package task3;

public interface Operation <T extends Number>{
    public T add (T t1, T t2);
    public T subtract (T t1, T t2);
    public T divide (T t1, T t2);
    public T multiply (T t1, T t2);
}
