package s0629;

public class TV implements Sound{
	int tv_sound;
	@Override
	public void SoundUp(int level) {
		// TODO Auto-generated method stub
		tv_sound+=(level*2);
		System.out.println("Ƽ��UP:"+tv_sound);
	}

	@Override
	public void SoundDown(int level) {
		if(tv_sound<=level) {
			tv_sound=0;
			System.out.println("Ƽ��DownMax:"+tv_sound);
		}
		else {
			tv_sound-=(level*2);
			System.out.println("Ƽ��Down:"+tv_sound);
		}
		
	}

	public int getTv_sound() {
		return tv_sound;
	}
	
	
}
