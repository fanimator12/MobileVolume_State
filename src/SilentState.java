public class SilentState extends AlertState
{

  @Override public void click(Phone phone)
  {
    phone.setState(new SilentState());
  }

  @Override public String alert()
  {
    return "[silent]";
  }

  @Override public void volumeUp(Phone phone)
  {
    phone.setState(new SoundState());
  }

  @Override public void volumeDown(Phone phone)
  {
    phone.setState(new SilentState());
  }
}
