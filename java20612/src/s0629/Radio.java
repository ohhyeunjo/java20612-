package s0629;

public class Radio implements Sound{
	int R_sound;
	
	@Override
	public void SoundUp(int level) {
		// TODO Auto-generated method stub
		R_sound+=level;
		System.out.println("����UP:"+R_sound);
	}

	@Override
	public void SoundDown(int level) {
		if(R_sound<=level) {
			R_sound=0;
			System.out.println("����DownMax:"+R_sound);
		}
		else {
			R_sound-=level;
			System.out.println("����Down:"+R_sound);
		}
		
	}

	public int getR_sound() {
		return R_sound;
	}
	
	
}
