public class Player extends Entity 
{
    private Item[] itens;
    private GameManager manager;
    
    public Player()
    {
    }

    public Player(int posX, int posY, GameManager manager)
    {
        super(posx, posY);
        this.manager = manager;
        itens = new Item[];
    }

    public Walk(Direction direction)
    {
        switch(direction)
        {
            case Direction.UP:
                posY++;
                break;
            case Direction.DOWN:
                posY--;
                break;
            case Direction.LEFT:
                posX--;
                break;
            case Direction.RIGHT:
                posX++;
                break;
        }
    }
    public UseItem()
    {
        Item item = itens.get(0);
        itens.remove(0);

        switch(item.tipo)
        {
            case Tipo.Report:
                Report(int posX, int posY);
                break;
            case Tipo.Escape:
                Escape();
                break;
            case Tipo.Read:
                DestroyFakeNews();
                break;
        }
    }
}
