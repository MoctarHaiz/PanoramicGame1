package com.HaizStudio.framework.implementation;

import android.media.SoundPool;

import com.HaizStudio.framework.Sound;

public class SoundAndroid implements Sound {
	int soundId;
	SoundPool soundPool;

	public SoundAndroid(SoundPool soundPool, int soundId) {
		this.soundId = soundId;
		this.soundPool = soundPool;
	}

	@Override
	public void play(float volume) {
		soundPool.play(soundId, volume, volume, 2, 0, 1);
	}


	//@Override
	//public void stop() {
		//soundPool.stop(soundId);
	//}

	@Override
	public void dispose() {
		soundPool.unload(soundId);
	}

}
