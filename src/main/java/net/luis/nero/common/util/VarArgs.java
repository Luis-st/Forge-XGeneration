package net.luis.nero.common.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class VarArgs<T> implements Iterable<T> {
	
	private final List<T> list;
	
	public VarArgs() {
		this.list = new ArrayList<T>();
	}
	
	@SafeVarargs
	public VarArgs(T... args) {
		this.list = new ArrayList<T>();
		this.addAll(args);
	}
	
	public void add(T arg) {
		this.list.add(arg);
	}
	
	public void addAll(Collection<T> args) {
		this.list.addAll(args);
	}
	
	@SuppressWarnings("unchecked")
	public void addAll(T... args) {
		this.addAll(Arrays.asList(args));
	}
	
	public T getType() {
		return this.list.get(0);
	}
	
	public boolean contains(T t) {
		return this.list.contains(t);
	}
	
	public int size() {
		return this.list.size();
	}
	
	public List<T> asList() {
		return this.list;
	}
	
	@SuppressWarnings("unchecked")
	public T[] asArray() {
		return (T[]) this.list.toArray();
	}
	
	public Stream<T> asStream() {
		return this.list.stream();
	}

	@Override
	public Iterator<T> iterator() {
		return this.list.iterator();
	}
	
}
