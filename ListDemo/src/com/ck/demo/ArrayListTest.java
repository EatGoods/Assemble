package com.ck.demo;

public class ArrayListTest {
	//声明初始长度
	private static  int DEFAULT_CAPACITY=10;
	//声明初始数组
	private Object[] elementData;
	//数组长度
	private int size;
	
	public int size() {
		return size;
	}
	
	public ArrayListTest() {
		this(DEFAULT_CAPACITY);
	}
	
	//初始化数组长度如果initialCapacity大于0  则数组长度为initialCapacity 否则抛出异常
	public ArrayListTest(int initialCapacity) {
		if(initialCapacity>0) {
			this.elementData=new Object[initialCapacity];
		}else {
			try {
				throw new Exception();
			}catch(Exception e) {
				System.out.print(e);
			}
			
		}
	}
	
	//新增方法 接受一个Object参数，每添加一个对象size+1  size默认为0
	public void add(Object obj) {
		//数组扩容当数组放满后默认为原数组的两倍，用等于号是因为size-1才是存放值的下角标
		if(size==elementData.length) {
			Object[] EMPTY_ELEMENTDATA=new Object[size*2];
			//将原数组中所有值拷贝到新数组中
			System.arraycopy(elementData, 0, EMPTY_ELEMENTDATA, 0, elementData.length);
			/*
			 * 上面哪一行等同于for循环中的语句
			 * for(int i=0;i<elementData.length;i++) {
				EMPTY_ELEMENTDATA[i]=elementData[i];
			}*/
			elementData=EMPTY_ELEMENTDATA;
		}
		elementData[size++]=obj;
	}
	
	//验证index是否符合要求
	public void rangeCheck(int index) {
		if (index >= size)
			try {
				throw new Exception();
			}catch(Exception e) {
				
			}  
	}
	
	//get方法
	public Object get(int index) {
		rangeCheck(index);
		return elementData[index];
	}
	
	public static void main(String[] args) {
		ArrayListTest list=new ArrayListTest();
		//验证写的add方法与扩容
		for(int i=0;i<12;i++) {
			list.add(i);
		}
		System.out.print(list.size());
	}
}
