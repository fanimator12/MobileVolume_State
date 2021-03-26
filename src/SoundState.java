public class SoundState extends AlertState
{
  @Override public void click(Phone phone)
  {
    phone.setState(new SoundState());
  }

  @Override public String alert()
  {
    return "DRIIIING";
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
