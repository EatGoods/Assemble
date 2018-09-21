package com.ck.demo;

public class ArrayListTest {
	//������ʼ����
	private static  int DEFAULT_CAPACITY=10;
	//������ʼ����
	private Object[] elementData;
	//���鳤��
	private int size;
	
	public int size() {
		return size;
	}
	
	public ArrayListTest() {
		this(DEFAULT_CAPACITY);
	}
	
	//��ʼ�����鳤�����initialCapacity����0  �����鳤��ΪinitialCapacity �����׳��쳣
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
	
	//�������� ����һ��Object������ÿ���һ������size+1  sizeĬ��Ϊ0
	public void add(Object obj) {
		//�������ݵ����������Ĭ��Ϊԭ������������õ��ں�����Ϊsize-1���Ǵ��ֵ���½Ǳ�
		if(size==elementData.length) {
			Object[] EMPTY_ELEMENTDATA=new Object[size*2];
			//��ԭ����������ֵ��������������
			System.arraycopy(elementData, 0, EMPTY_ELEMENTDATA, 0, elementData.length);
			/*
			 * ������һ�е�ͬ��forѭ���е����
			 * for(int i=0;i<elementData.length;i++) {
				EMPTY_ELEMENTDATA[i]=elementData[i];
			}*/
			elementData=EMPTY_ELEMENTDATA;
		}
		elementData[size++]=obj;
	}
	
	//��֤index�Ƿ����Ҫ��
	public void rangeCheck(int index) {
		if (index >= size)
			try {
				throw new Exception();
			}catch(Exception e) {
				
			}  
	}
	
	//get����
	public Object get(int index) {
		rangeCheck(index);
		return elementData[index];
	}
	
	public static void main(String[] args) {
		ArrayListTest list=new ArrayListTest();
		//��֤д��add����������
		for(int i=0;i<12;i++) {
			list.add(i);
		}
		System.out.print(list.size());
	}
}
