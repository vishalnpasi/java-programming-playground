package com.java.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(){}
	public TreeNode(int val){
		this.val = val;
	}
	TreeNode(int val, TreeNode left, TreeNode right){
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
class BST{
	int val;
	BST left, right;
	BST(){

	}
	BST(int val){
		this. val = val;
		left = right = null;
	}
	BST insert(BST node, int key){
		if(node == null) return new BST(key);

		if(key < node.val) node.left = insert(node.left, key);

		else node.right = insert(node.right, key);
		return node;
	}
}
@SpringBootApplication
@RestController
public class LoginApplication {
	public static void print(BST node) {
		if (node != null) {
//			System.out.println("root:"+node.val);
			if (node.left != null) {
				System.out.println("root;"+node.val+"left:"+node.left.val);
				print(node.left);
			}
			if (node.right != null){
				System.out.println("root;"+node.val+"right:"+node.right.val);
				print(node.right);
			}
		}
	}
	public static void main(String[] args) {

		long currentTimeMillis= System.currentTimeMillis();
//		SpringApplication.run(LoginApplication.class, args);
		System.out.println("after run currentTimeMills:"+((System.currentTimeMillis())- currentTimeMillis));
		System.out.println("*********************************Java Program Started*********************************");
//		root = [5,4,8,11,null,13,4,7,2,null,null,5,1]

		BST node = new BST(-2);
		int []arr = {5,4,8,11,111,13,4,7,2,12,13,5,1};
		for(int i =0;i < arr.length;i++){
//			System.out.println("root arr:"+arr[i]);
			node.insert(node, arr[i]);
		}
//		node = node.right;
		print(node);
	}
	@GetMapping("/testMain")
	public Object test(){
		return "TestMain";
	}
}