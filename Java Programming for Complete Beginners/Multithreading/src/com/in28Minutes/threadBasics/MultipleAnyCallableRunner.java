package com.in28Minutes.threadBasics;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(4);

		List<CallableTask> tasks = List.of(new CallableTask("1"), new CallableTask("2"), new CallableTask("3"),
				new CallableTask("4"));

		String result = executorService.invokeAny(tasks);

		System.out.println(result);

		executorService.shutdown();
	}
}
