public class Item {
    private Type type;

    public Item(Type type)
    {
        this.SetType(type);
    }

    public Type GetType()
    {
        return type;
    }

    public void SetType(Type type)
    {
        if(type == null)
            return;
        this.type = type;
    }
}
