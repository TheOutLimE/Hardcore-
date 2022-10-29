package net.mcreator.statmod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelCreeperBig<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("stat_mod", "model_creeper_big"), "main");
	public final ModelPart body;
	public final ModelPart leftleg1;
	public final ModelPart leftleg2;
	public final ModelPart rightleg1;
	public final ModelPart rightleg2;
	public final ModelPart head;

	public ModelCreeperBig(ModelPart root) {
		this.body = root.getChild("body");
		this.leftleg1 = root.getChild("leftleg1");
		this.leftleg2 = root.getChild("leftleg2");
		this.rightleg1 = root.getChild("rightleg1");
		this.rightleg2 = root.getChild("rightleg2");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(32, 32).addBox(-8.0F, -36.0F, -2.0F, 16.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, -2.0F));
		PartDefinition leftleg1 = partdefinition.addOrReplaceChild("leftleg1",
				CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -12.0F, -10.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, -2.0F));
		PartDefinition leftleg2 = partdefinition.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -2.0F));
		PartDefinition cube_r1 = leftleg2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 32).addBox(-8.0F, -12.0F, -14.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition rightleg1 = partdefinition.addOrReplaceChild("rightleg1",
				CubeListBuilder.create().texOffs(0, 32).addBox(-8.0F, -12.0F, -10.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, -2.0F));
		PartDefinition rightleg2 = partdefinition.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -2.0F));
		PartDefinition cube_r2 = rightleg2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -12.0F, -14.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -52.0F, -6.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, -2.0F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.rightleg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftleg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightleg1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftleg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
