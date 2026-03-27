public class Item {
    private Type type[];

    public Item(Type type)
    {
        this.SetType(type);
    }

    public Type GetType(int index)
    {
        return type[index];
    }

    public void SetType(Type type)
    {
        if(type == null)
            return;
        //arrumar para vetor
        this.type = type;
    }
}
