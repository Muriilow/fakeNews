public class Player extends Entity implements Movement
{
    private Item[] itens;
    private GameManager manager;
    
    public Player()
    {
    }

    public Player(int posX, int posY, GameManager manager)
    {
        super(posX, posY);
        this.manager = manager;
        itens = new Item[];
    }

    public void Walk(Direction direction)
    {
        switch(direction)
        {
            case UP:
                posY++;
                break;
            case DOWN:
                posY--;
                break;
            case LEFT:
                posX--;
                break;
            case RIGHT:
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
