package me.sub.angels.client.models.entity;

import me.sub.angels.client.models.poses.AngelPoses;
import me.sub.angels.common.entities.EntityAngel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelAngel extends ModelBase {
	
	/**
	 * Weeping Angel - Ford Created using Techne
	 */
	ModelRenderer AngryLeftArm2;
	ModelRenderer AngryRightArm2;
	ModelRenderer AngryLeftArm1;
	ModelRenderer AngryRightArm1;
	ModelRenderer LeftEyebrow;
	ModelRenderer RightEyebrow;
	ModelRenderer Headband;
	ModelRenderer Nose;
	ModelRenderer Chin;
	ModelRenderer ChinAngleLeft;
	ModelRenderer ChinAngleRight;
	ModelRenderer CheekLeft;
	ModelRenderer CheekRight;
	ModelRenderer HeadMain;
	ModelRenderer HeadUnder;
	ModelRenderer Teeth;
	ModelRenderer Hair1;
	ModelRenderer Hair2;
	ModelRenderer Hair3;
	ModelRenderer Hair4;
	ModelRenderer Hair5;
	ModelRenderer Hair6;
	ModelRenderer Hair7;
	ModelRenderer Hair8;
	ModelRenderer Hair9;
	ModelRenderer Hair10;
	ModelRenderer Hair11;
	ModelRenderer Hair12;
	ModelRenderer TorsoMain;
	ModelRenderer Dress1;
	ModelRenderer Dress2;
	ModelRenderer Dress3;
	ModelRenderer Dress4;
	ModelRenderer Dress5;
	ModelRenderer Dress6;
	ModelRenderer Dress7;
	ModelRenderer Dress8;
	ModelRenderer Dress9;
	ModelRenderer Dress10;
	ModelRenderer Dress11;
	ModelRenderer Dress12;
	ModelRenderer Dress13;
	ModelRenderer RightArm1;
	ModelRenderer RightArm2;
	ModelRenderer LeftArm1;
	ModelRenderer LeftArm2;
	ModelRenderer LeftWing1;
	ModelRenderer LeftWing2;
	ModelRenderer LeftWing3;
	ModelRenderer LeftWing4;
	ModelRenderer LeftWing5;
	ModelRenderer LeftWing6;
	ModelRenderer LeftWing7;
	ModelRenderer LeftWing8;
	ModelRenderer LeftWing9;
	ModelRenderer RightWing1;
	ModelRenderer RightWing2;
	ModelRenderer RightWing3;
	ModelRenderer RightWing4;
	ModelRenderer RightWing5;
	ModelRenderer RightWing6;
	ModelRenderer RightWing7;
	ModelRenderer RightWing8;
	ModelRenderer RightWing9;
	
	public ModelAngel() {
		textureWidth = 128;
		textureHeight = 128;
		
		LeftEyebrow = new ModelRenderer(this, 50, 8);
		LeftEyebrow.addBox(-2F, -1F, 0F, 2, 1, 1);
		LeftEyebrow.setRotationPoint(-1F, -4F, -4.2F);
		LeftEyebrow.setTextureSize(128, 128);
		LeftEyebrow.mirror = true;
		setRotation(LeftEyebrow, -0.3490659F, 0F, 0F);
		RightEyebrow = new ModelRenderer(this, 50, 8);
		RightEyebrow.addBox(0F, -1F, 0F, 2, 1, 1);
		RightEyebrow.setRotationPoint(1F, -4F, -4.2F);
		RightEyebrow.setTextureSize(128, 128);
		RightEyebrow.mirror = true;
		setRotation(RightEyebrow, -0.3490659F, 0F, 0F);
		Headband = new ModelRenderer(this, 76, 0);
		Headband.addBox(-4.5F, 0F, -0.5F, 9, 1, 9);
		Headband.setRotationPoint(0F, -7.5F, -4F);
		Headband.setTextureSize(128, 128);
		Headband.mirror = true;
		setRotation(Headband, -0.1745329F, 0F, 0F);
		Nose = new ModelRenderer(this, 62, 8);
		Nose.addBox(-1F, -3F, -4.1F, 2, 1, 1);
		Nose.setRotationPoint(0F, 0F, 0F);
		Nose.setTextureSize(128, 128);
		Nose.mirror = true;
		setRotation(Nose, 0F, 0F, 0F);
		Chin = new ModelRenderer(this, 62, 2);
		Chin.addBox(-2F, -0.7F, -4F, 4, 1, 2);
		Chin.setRotationPoint(0F, 0F, 0F);
		Chin.setTextureSize(128, 128);
		Chin.mirror = true;
		setRotation(Chin, 0F, 0F, 0F);
		ChinAngleLeft = new ModelRenderer(this, 62, 5);
		ChinAngleLeft.addBox(-2F, -1F, 0F, 2, 1, 2);
		ChinAngleLeft.setRotationPoint(-2F, 0.3F, -4F);
		ChinAngleLeft.setTextureSize(128, 128);
		ChinAngleLeft.mirror = true;
		setRotation(ChinAngleLeft, 0F, 0F, 0.2792527F);
		ChinAngleRight = new ModelRenderer(this, 62, 5);
		ChinAngleRight.addBox(0F, -1F, 0F, 2, 1, 2);
		ChinAngleRight.setRotationPoint(2F, 0.3F, -4F);
		ChinAngleRight.setTextureSize(128, 128);
		ChinAngleRight.mirror = true;
		setRotation(ChinAngleRight, 0F, 0F, -0.2792527F);
		CheekLeft = new ModelRenderer(this, 62, 0);
		CheekLeft.addBox(-4F, -1F, -4F, 3, 1, 1);
		CheekLeft.setRotationPoint(0F, 0F, 0F);
		CheekLeft.setTextureSize(128, 128);
		CheekLeft.mirror = true;
		setRotation(CheekLeft, 0F, 0F, 0F);
		CheekRight = new ModelRenderer(this, 62, 0);
		CheekRight.addBox(1F, -1F, -4F, 3, 1, 1);
		CheekRight.setRotationPoint(0F, 0F, 0F);
		CheekRight.setTextureSize(128, 128);
		CheekRight.mirror = true;
		setRotation(CheekRight, 0F, 0F, 0F);
		HeadMain = new ModelRenderer(this, 0, 0);
		HeadMain.addBox(-4F, -8F, -4F, 8, 7, 8);
		HeadMain.setRotationPoint(0F, 0F, 0F);
		HeadMain.setTextureSize(128, 128);
		HeadMain.mirror = true;
		setRotation(HeadMain, 0F, 0F, 0F);
		HeadUnder = new ModelRenderer(this, 32, 0);
		HeadUnder.addBox(-4F, -1F, -3F, 8, 1, 7);
		HeadUnder.setRotationPoint(0F, 0F, 0F);
		HeadUnder.setTextureSize(128, 128);
		HeadUnder.mirror = true;
		setRotation(HeadUnder, 0F, 0F, 0F);
		Teeth = new ModelRenderer(this, 70, 0);
		Teeth.addBox(-1F, -1.7F, -3.9F, 2, 1, 1);
		Teeth.setRotationPoint(0F, 0F, 0F);
		Teeth.setTextureSize(128, 128);
		Teeth.mirror = true;
		setRotation(Teeth, 0F, 0F, 0F);
		Hair1 = new ModelRenderer(this, 32, 8);
		Hair1.addBox(-4F, 0F, 0F, 8, 1, 1);
		Hair1.setRotationPoint(0F, -7F, -4F);
		Hair1.setTextureSize(128, 128);
		Hair1.mirror = true;
		setRotation(Hair1, -0.0872665F, 0F, 0F);
		Hair2 = new ModelRenderer(this, 32, 10);
		Hair2.addBox(-4F, 1F, 0F, 1, 1, 1);
		Hair2.setRotationPoint(0F, -7F, -4F);
		Hair2.setTextureSize(128, 128);
		Hair2.mirror = true;
		setRotation(Hair2, -0.0872665F, 0F, 0F);
		Hair3 = new ModelRenderer(this, 32, 10);
		Hair3.addBox(3F, 1F, 0F, 1, 1, 1);
		Hair3.setRotationPoint(0F, -7F, -4F);
		Hair3.setTextureSize(128, 128);
		Hair3.mirror = true;
		setRotation(Hair3, -0.0872665F, 0F, 0F);
		Hair4 = new ModelRenderer(this, 32, 12);
		Hair4.addBox(-1F, 0F, -4F, 1, 2, 1);
		Hair4.setRotationPoint(4F, -7F, 0F);
		Hair4.setTextureSize(128, 128);
		Hair4.mirror = true;
		setRotation(Hair4, 0F, 0F, -0.0872665F);
		Hair5 = new ModelRenderer(this, 32, 12);
		Hair5.addBox(-1F, 2F, -3F, 1, 2, 1);
		Hair5.setRotationPoint(4F, -7F, 0F);
		Hair5.setTextureSize(128, 128);
		Hair5.mirror = true;
		setRotation(Hair5, 0F, 0F, -0.0872665F);
		Hair6 = new ModelRenderer(this, 32, 12);
		Hair6.addBox(-1F, 4F, -2F, 1, 2, 1);
		Hair6.setRotationPoint(4F, -7F, 0F);
		Hair6.setTextureSize(128, 128);
		Hair6.mirror = true;
		setRotation(Hair6, 0F, 0F, -0.0872665F);
		Hair7 = new ModelRenderer(this, 36, 10);
		Hair7.addBox(-1F, 6F, -1F, 1, 1, 5);
		Hair7.setRotationPoint(4F, -7F, 0F);
		Hair7.setTextureSize(128, 128);
		Hair7.mirror = true;
		setRotation(Hair7, 0F, 0F, -0.0872665F);
		Hair8 = new ModelRenderer(this, 48, 10);
		Hair8.addBox(-4F, 6F, -1F, 8, 1, 1);
		Hair8.setRotationPoint(0F, -7F, 4F);
		Hair8.setTextureSize(128, 128);
		Hair8.mirror = true;
		setRotation(Hair8, 0.0872665F, 0F, 0F);
		Hair9 = new ModelRenderer(this, 36, 10);
		Hair9.addBox(0F, 6F, -1F, 1, 1, 5);
		Hair9.setRotationPoint(-4F, -7F, 0F);
		Hair9.setTextureSize(128, 128);
		Hair9.mirror = true;
		setRotation(Hair9, 0F, 0F, 0.0872665F);
		Hair10 = new ModelRenderer(this, 32, 12);
		Hair10.addBox(0F, 4F, -2F, 1, 2, 1);
		Hair10.setRotationPoint(-4F, -7F, 0F);
		Hair10.setTextureSize(128, 128);
		Hair10.mirror = true;
		setRotation(Hair10, 0F, 0F, 0.0872665F);
		Hair11 = new ModelRenderer(this, 32, 12);
		Hair11.addBox(0F, 2F, -3F, 1, 2, 1);
		Hair11.setRotationPoint(-4F, -7F, 0F);
		Hair11.setTextureSize(128, 128);
		Hair11.mirror = true;
		setRotation(Hair11, 0F, 0F, 0.0872665F);
		Hair12 = new ModelRenderer(this, 32, 12);
		Hair12.addBox(0F, 0F, -4F, 1, 2, 1);
		Hair12.setRotationPoint(-4F, -7F, 0F);
		Hair12.setTextureSize(128, 128);
		Hair12.mirror = true;
		setRotation(Hair12, 0F, 0F, 0.0872665F);
		TorsoMain = new ModelRenderer(this, 16, 16);
		TorsoMain.addBox(-4F, 0F, -2F, 8, 23, 4);
		TorsoMain.setRotationPoint(0F, 0F, 0F);
		TorsoMain.setTextureSize(128, 128);
		TorsoMain.mirror = true;
		setRotation(TorsoMain, 0F, 0F, 0F);
		Dress1 = new ModelRenderer(this, 76, 16);
		Dress1.addBox(-4F, 0F, 0F, 8, 8, 1);
		Dress1.setRotationPoint(0F, 2F, -2F);
		Dress1.setTextureSize(128, 128);
		Dress1.mirror = true;
		setRotation(Dress1, -0.0523599F, 0F, 0F);
		Dress2 = new ModelRenderer(this, 94, 16);
		Dress2.addBox(-1F, 0F, -2F, 1, 8, 4);
		Dress2.setRotationPoint(4F, 2F, 0F);
		Dress2.setTextureSize(128, 128);
		Dress2.mirror = true;
		setRotation(Dress2, 0F, 0F, -0.0523599F);
		Dress3 = new ModelRenderer(this, 76, 16);
		Dress3.addBox(-4F, 0F, -1F, 8, 8, 1);
		Dress3.setRotationPoint(0F, 2F, 2F);
		Dress3.setTextureSize(128, 128);
		Dress3.mirror = true;
		setRotation(Dress3, 0.0523599F, 0F, 0F);
		Dress4 = new ModelRenderer(this, 94, 16);
		Dress4.addBox(0F, 0F, -2F, 1, 8, 4);
		Dress4.setRotationPoint(-4F, 2F, 0F);
		Dress4.setTextureSize(128, 128);
		Dress4.mirror = true;
		setRotation(Dress4, 0F, 0F, 0.0523599F);
		Dress5 = new ModelRenderer(this, 76, 25);
		Dress5.addBox(-4F, 0F, 0F, 8, 12, 1);
		Dress5.setRotationPoint(0F, 11F, -2F);
		Dress5.setTextureSize(128, 128);
		Dress5.mirror = true;
		setRotation(Dress5, -0.0523599F, 0F, 0F);
		Dress6 = new ModelRenderer(this, 76, 38);
		Dress6.addBox(-1F, 0F, -2F, 1, 12, 4);
		Dress6.setRotationPoint(4F, 11F, 0F);
		Dress6.setTextureSize(128, 128);
		Dress6.mirror = true;
		setRotation(Dress6, 0F, 0F, -0.0523599F);
		Dress7 = new ModelRenderer(this, 76, 25);
		Dress7.addBox(-4F, 0F, -1F, 8, 12, 1);
		Dress7.setRotationPoint(0F, 11F, 2F);
		Dress7.setTextureSize(128, 128);
		Dress7.mirror = true;
		setRotation(Dress7, 0.0523599F, 0F, 0F);
		Dress8 = new ModelRenderer(this, 76, 38);
		Dress8.addBox(0F, 0F, -2F, 1, 12, 4);
		Dress8.setRotationPoint(-4F, 11F, 0F);
		Dress8.setTextureSize(128, 128);
		Dress8.mirror = true;
		setRotation(Dress8, 0F, 0F, 0.0523599F);
		Dress9 = new ModelRenderer(this, 76, 59);
		Dress9.addBox(-4F, 0F, 0F, 8, 1, 3);
		Dress9.setRotationPoint(0F, 23F, -3F);
		Dress9.setTextureSize(128, 128);
		Dress9.mirror = true;
		setRotation(Dress9, 1.27409F, 0F, 0F);
		Dress10 = new ModelRenderer(this, 76, 63);
		Dress10.addBox(-3F, 0F, -2F, 3, 1, 4);
		Dress10.setRotationPoint(5F, 23F, 0F);
		Dress10.setTextureSize(128, 128);
		Dress10.mirror = true;
		setRotation(Dress10, 0F, 0F, 1.27409F);
		Dress11 = new ModelRenderer(this, 76, 59);
		Dress11.addBox(-4F, 0F, -3F, 8, 1, 3);
		Dress11.setRotationPoint(0F, 23F, 3F);
		Dress11.setTextureSize(128, 128);
		Dress11.mirror = true;
		setRotation(Dress11, -1.27409F, 0F, 0F);
		Dress12 = new ModelRenderer(this, 76, 63);
		Dress12.addBox(0F, 0F, -2F, 3, 1, 4);
		Dress12.setRotationPoint(-5F, 23F, 0F);
		Dress12.setTextureSize(128, 128);
		Dress12.mirror = true;
		setRotation(Dress12, 0F, 0F, -1.27409F);
		Dress13 = new ModelRenderer(this, 76, 68);
		Dress13.addBox(-5F, 23F, -3F, 10, 1, 6);
		Dress13.setRotationPoint(0F, 0F, 0F);
		Dress13.setTextureSize(128, 128);
		Dress13.mirror = true;
		setRotation(Dress13, 0F, 0F, 0F);
		RightArm1 = new ModelRenderer(this, 58, 16);
		RightArm1.addBox(-3F, -3F, 0F, 3, 3, 6);
		RightArm1.setRotationPoint(-5F, 3F, -5F);
		RightArm1.setTextureSize(128, 128);
		RightArm1.mirror = true;
		setRotation(RightArm1, -0.2268928F, 0F, 0.5235988F);
		RightArm2 = new ModelRenderer(this, 58, 25);
		RightArm2.addBox(-3F, -3F, -6F, 3, 3, 6);
		RightArm2.setRotationPoint(-5F, 3F, -5F);
		RightArm2.setTextureSize(128, 128);
		RightArm2.mirror = true;
		setRotation(RightArm2, -0.9250245F, 0F, 0.5235988F);
		LeftArm1 = new ModelRenderer(this, 40, 16);
		LeftArm1.addBox(0F, -3F, 0F, 3, 3, 6);
		LeftArm1.setRotationPoint(5F, 3F, -5F);
		LeftArm1.setTextureSize(128, 128);
		LeftArm1.mirror = true;
		setRotation(LeftArm1, -0.2268928F, 0F, -0.5235988F);
		LeftArm2 = new ModelRenderer(this, 40, 25);
		LeftArm2.addBox(0F, -3F, -6F, 3, 3, 6);
		LeftArm2.setRotationPoint(5F, 3F, -5F);
		LeftArm2.setTextureSize(128, 128);
		LeftArm2.mirror = true;
		setRotation(LeftArm2, -0.9250245F, 0F, -0.5235988F);
		LeftWing1 = new ModelRenderer(this, 0, 43);
		LeftWing1.addBox(-3F, 0F, -1F, 3, 6, 1);
		LeftWing1.setRotationPoint(3F, 1.5F, 4F);
		LeftWing1.setTextureSize(128, 128);
		LeftWing1.mirror = true;
		setRotation(LeftWing1, 0F, -0.8726646F, 0F);
		LeftWing2 = new ModelRenderer(this, 10, 43);
		LeftWing2.addBox(0F, 0F, -1F, 3, 6, 1);
		LeftWing2.setRotationPoint(3F, 1.5F, 4F);
		LeftWing2.setTextureSize(128, 128);
		LeftWing2.mirror = true;
		setRotation(LeftWing2, 0F, -0.122173F, 0F);
		LeftWing3 = new ModelRenderer(this, 20, 43);
		LeftWing3.addBox(3F, -2F, -1F, 1, 10, 1);
		LeftWing3.setRotationPoint(3F, 1.5F, 4F);
		LeftWing3.setTextureSize(128, 128);
		LeftWing3.mirror = true;
		setRotation(LeftWing3, 0F, -0.122173F, 0F);
		LeftWing4 = new ModelRenderer(this, 26, 43);
		LeftWing4.addBox(4F, -3F, -1F, 1, 13, 1);
		LeftWing4.setRotationPoint(3F, 1.5F, 4F);
		LeftWing4.setTextureSize(128, 128);
		LeftWing4.mirror = true;
		setRotation(LeftWing4, 0F, -0.122173F, 0F);
		LeftWing5 = new ModelRenderer(this, 32, 43);
		LeftWing5.addBox(5F, -4F, -1F, 1, 16, 1);
		LeftWing5.setRotationPoint(3F, 1.5F, 4F);
		LeftWing5.setTextureSize(128, 128);
		LeftWing5.mirror = true;
		setRotation(LeftWing5, 0F, -0.122173F, 0F);
		LeftWing6 = new ModelRenderer(this, 38, 43);
		LeftWing6.addBox(6F, -4F, -1F, 1, 18, 1);
		LeftWing6.setRotationPoint(3F, 1.5F, 4F);
		LeftWing6.setTextureSize(128, 128);
		LeftWing6.mirror = true;
		setRotation(LeftWing6, 0F, -0.122173F, 0F);
		LeftWing7 = new ModelRenderer(this, 44, 43);
		LeftWing7.addBox(7F, -3F, -1F, 1, 19, 1);
		LeftWing7.setRotationPoint(3F, 1.5F, 4F);
		LeftWing7.setTextureSize(128, 128);
		LeftWing7.mirror = true;
		setRotation(LeftWing7, 0F, -0.122173F, 0F);
		LeftWing8 = new ModelRenderer(this, 50, 43);
		LeftWing8.addBox(8F, -2F, -1F, 1, 17, 1);
		LeftWing8.setRotationPoint(3F, 1.5F, 4F);
		LeftWing8.setTextureSize(128, 128);
		LeftWing8.mirror = true;
		setRotation(LeftWing8, 0F, -0.122173F, 0F);
		LeftWing9 = new ModelRenderer(this, 56, 43);
		LeftWing9.addBox(9F, 0F, -1F, 1, 13, 1);
		LeftWing9.setRotationPoint(3F, 1.5F, 4F);
		LeftWing9.setTextureSize(128, 128);
		LeftWing9.mirror = true;
		setRotation(LeftWing9, 0F, -0.122173F, 0F);
		RightWing1 = new ModelRenderer(this, 0, 43);
		RightWing1.addBox(0F, 0F, -1F, 3, 6, 1);
		RightWing1.setRotationPoint(-3F, 1.5F, 4F);
		RightWing1.setTextureSize(128, 128);
		RightWing1.mirror = true;
		setRotation(RightWing1, 0F, 0.8726646F, 0F);
		RightWing2 = new ModelRenderer(this, 10, 43);
		RightWing2.addBox(-3F, 0F, -1F, 3, 6, 1);
		RightWing2.setRotationPoint(-3F, 1.5F, 4F);
		RightWing2.setTextureSize(128, 128);
		RightWing2.mirror = true;
		setRotation(RightWing2, 0F, 0.122173F, 0F);
		RightWing3 = new ModelRenderer(this, 20, 43);
		RightWing3.addBox(-4F, -2F, -1F, 1, 10, 1);
		RightWing3.setRotationPoint(-3F, 1.5F, 4F);
		RightWing3.setTextureSize(128, 128);
		RightWing3.mirror = true;
		setRotation(RightWing3, 0F, 0.122173F, 0F);
		RightWing4 = new ModelRenderer(this, 26, 43);
		RightWing4.addBox(-5F, -3F, -1F, 1, 13, 1);
		RightWing4.setRotationPoint(-3F, 1.5F, 4F);
		RightWing4.setTextureSize(128, 128);
		RightWing4.mirror = true;
		setRotation(RightWing4, 0F, 0.122173F, 0F);
		RightWing5 = new ModelRenderer(this, 32, 43);
		RightWing5.addBox(-6F, -4F, -1F, 1, 16, 1);
		RightWing5.setRotationPoint(-3F, 1.5F, 4F);
		RightWing5.setTextureSize(128, 128);
		RightWing5.mirror = true;
		setRotation(RightWing5, 0F, 0.122173F, 0F);
		RightWing6 = new ModelRenderer(this, 38, 43);
		RightWing6.addBox(-7F, -4F, -1F, 1, 18, 1);
		RightWing6.setRotationPoint(-3F, 1.5F, 4F);
		RightWing6.setTextureSize(128, 128);
		RightWing6.mirror = true;
		setRotation(RightWing6, 0F, 0.122173F, 0F);
		RightWing7 = new ModelRenderer(this, 44, 43);
		RightWing7.addBox(-8F, -3F, -1F, 1, 19, 1);
		RightWing7.setRotationPoint(-3F, 1.5F, 4F);
		RightWing7.setTextureSize(128, 128);
		RightWing7.mirror = true;
		setRotation(RightWing7, 0F, 0.122173F, 0F);
		RightWing8 = new ModelRenderer(this, 50, 43);
		RightWing8.addBox(-9F, -2F, -1F, 1, 17, 1);
		RightWing8.setRotationPoint(-3F, 1.5F, 4F);
		RightWing8.setTextureSize(128, 128);
		RightWing8.mirror = true;
		setRotation(RightWing8, 0F, 0.122173F, 0F);
		RightWing9 = new ModelRenderer(this, 56, 43);
		RightWing9.addBox(-10F, 0F, -1F, 1, 13, 1);
		RightWing9.setRotationPoint(-3F, 1.5F, 4F);
		RightWing9.setTextureSize(128, 128);
		RightWing9.mirror = true;
		setRotation(RightWing9, 0F, 0.122173F, 0F);
		
		AngryRightArm1 = new ModelRenderer(this, 58, 16);
		AngryRightArm1.addBox(-3F, -3F, 0F, 3, 3, 6);
		AngryRightArm1.setRotationPoint(-4F, 5F, -4F);
		AngryRightArm1.setTextureSize(128, 128);
		AngryRightArm1.mirror = true;
		setRotation(AngryRightArm1, 0.2792527F, 0F, 0F);
		AngryRightArm2 = new ModelRenderer(this, 58, 25);
		AngryRightArm2.addBox(-3F, -3F, -6F, 3, 3, 6);
		AngryRightArm2.setRotationPoint(-4F, 5F, -4F);
		AngryRightArm2.setTextureSize(128, 128);
		AngryRightArm2.mirror = true;
		setRotation(AngryRightArm2, -0.5235988F, 0F, 0F);
		AngryLeftArm1 = new ModelRenderer(this, 40, 16);
		AngryLeftArm1.addBox(0F, -3F, 0F, 3, 3, 6);
		AngryLeftArm1.setRotationPoint(4F, 5F, -4F);
		AngryLeftArm1.setTextureSize(128, 128);
		AngryLeftArm1.mirror = true;
		setRotation(AngryLeftArm1, 0.2792527F, 0F, 0F);
		AngryLeftArm2 = new ModelRenderer(this, 40, 25);
		AngryLeftArm2.addBox(0F, -3F, -6F, 3, 3, 6);
		AngryLeftArm2.setRotationPoint(4F, 5F, -4F);
		AngryLeftArm2.setTextureSize(128, 128);
		AngryLeftArm2.mirror = true;
		setRotation(AngryLeftArm2, -0.5235988F, 0F, 0F);
		
	}
	
	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		EntityAngel angel = null;
		
		if (entity instanceof EntityAngel) {
			angel = (EntityAngel) entity;
		}
		
		// Head
		GlStateManager.pushMatrix();
		
		GlStateManager.pushMatrix();
		GlStateManager.enableLighting();
		if (!angel.getPoseName().equals(AngelPoses.ANGRY.toString())) {
			GlStateManager.rotate(20, 1, 0, 0);
		}
		LeftEyebrow.render(scale);
		RightEyebrow.render(scale);
		Headband.render(scale);
		Nose.render(scale);
		Chin.render(scale);
		ChinAngleLeft.render(scale);
		ChinAngleRight.render(scale);
		CheekLeft.render(scale);
		CheekRight.render(scale);
		HeadMain.render(scale);
		HeadUnder.render(scale);
		Teeth.render(scale);
		Hair1.render(scale);
		Hair2.render(scale);
		Hair3.render(scale);
		Hair4.render(scale);
		Hair5.render(scale);
		Hair6.render(scale);
		Hair7.render(scale);
		Hair8.render(scale);
		Hair9.render(scale);
		Hair10.render(scale);
		Hair11.render(scale);
		Hair12.render(scale);
		GlStateManager.popMatrix();

        if (angel.getPoseName().equals(AngelPoses.ANGRY.toString())) {
			AngryRightArm1.render(scale);
			AngryRightArm2.render(scale);
			AngryLeftArm1.render(scale);
			AngryLeftArm2.render(scale);
		} else {
			RightArm1.render(scale);
			RightArm2.render(scale);
			LeftArm1.render(scale);
			LeftArm2.render(scale);
		}
		
		// Body
		TorsoMain.render(scale);
		Dress1.render(scale);
		Dress2.render(scale);
		Dress3.render(scale);
		Dress4.render(scale);
		Dress5.render(scale);
		Dress6.render(scale);
		Dress7.render(scale);
		Dress8.render(scale);
		Dress9.render(scale);
		Dress10.render(scale);
		Dress11.render(scale);
		Dress12.render(scale);
		Dress13.render(scale);
		LeftWing1.render(scale);
		LeftWing2.render(scale);
		LeftWing3.render(scale);
		LeftWing4.render(scale);
		LeftWing5.render(scale);
		LeftWing6.render(scale);
		LeftWing7.render(scale);
		LeftWing8.render(scale);
		LeftWing9.render(scale);
		RightWing1.render(scale);
		RightWing2.render(scale);
		RightWing3.render(scale);
		RightWing4.render(scale);
		RightWing5.render(scale);
		RightWing6.render(scale);
		RightWing7.render(scale);
		RightWing8.render(scale);
		RightWing9.render(scale);
		GlStateManager.disableLighting();
		GlStateManager.popMatrix();
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
