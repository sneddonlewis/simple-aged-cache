package io.collective;

import java.time.Clock;

public class SimpleAgedCache {

	private Clock clock;
    private ExpirableEntry head;
    private ExpirableEntry tail;

    public SimpleAgedCache(Clock clock) {
        this.head = null;
        this.tail = this.head;
		this.clock = clock;
    }

    public SimpleAgedCache() {
        this.head = null;
        this.tail = this.head;
		this.clock = Clock.systemUTC();
    }

    public void put(Object key, Object value, int retentionInMillis) {
		// keep calling next until there's a value
		ExpirableEntry input = new ExpirableEntry(key, value, this.clock, retentionInMillis);
        if (this.head = null) {
            this.head = input;
            this.tail = input;
            return;
        }
		var current = this.head;
		while (current != null) {
			current = current.getNext();
		}
		current = input;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
		int count = 0;
		var current = this.head;
		// traverse collection and increment for every item present and non expired
        return 0;
    }

    public Object get(Object key) {
        return null;
    }

}
