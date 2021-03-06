package me.swirtzly.angels.client.models.poses;

import me.swirtzly.angels.common.entities.WeepingAngelEntity;
import net.minecraft.client.renderer.entity.model.RendererModel;

public class PoseOpenArms extends PoseBase {
	
	public PoseOpenArms() {
	}

    public PoseOpenArms(WeepingAngelEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netheadYaw, float headPitch, float swingProgress) {
		super(entity, limbSwing, limbSwingAmount, ageInTicks, netheadYaw, headPitch, swingProgress);
	}
	
	@Override
	public void setArmAngles(RendererModel left_arm, RendererModel right_arm, RendererModel wrist_left, RendererModel wrist_right) {
		left_arm.rotateAngleX = degreeToRadian(-90);
		right_arm.rotateAngleX = degreeToRadian(-90);
		
		left_arm.rotateAngleY = degreeToRadian(30);
		right_arm.rotateAngleY = degreeToRadian(-30);
		
		left_arm.rotateAngleZ = degreeToRadian(-30);
		right_arm.rotateAngleZ = degreeToRadian(30);
		
		wrist_left.rotateAngleX = degreeToRadian(-45);
		wrist_right.rotateAngleX = degreeToRadian(-45);
	}
	
	@Override
	public void setHeadAngles(RendererModel head) {
		head.rotateAngleX = degreeToRadian(15);
	}
	
	@Override
	public boolean angryFace() {
		return true;
	}
	
	@Override
	public void setWingAngles(RendererModel left_wing, RendererModel right_wing) {
		
	}
	
	@Override
	public void setBodyAngles(RendererModel body) {
		body.rotateAngleX = degreeToRadian(0);
	}
	
}
