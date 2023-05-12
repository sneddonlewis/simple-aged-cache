package io.collective;

import java.time.Clock;
import java.util.Optional;

public class SimpleAgedCache {

    private Optional<ExpirableEntry> head;

    public SimpleAgedCache(Clock clock) {
        this.head = Optional.empty();
    }

    public SimpleAgedCache() {
    }

    public void put(Object key, Object value, int retentionInMillis) {
    }

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return 0;
    }

    public Object get(Object key) {
        return null;
    }

    class ExpirableEntry {
        private Object key;
        private Object value;
        private Clock clock;
        private Optional<ExpirableEntry> next;

        public ExpirableEntry(Object key, Object value, Clock clock) {
            this.key = key;
            this.value = value;
            this.clock = clock;
        }

        public Optional<ExpirableEntry> getNext() {
            return next;
        }

        public void setNext(Optional<ExpirableEntry> next) {
            this.next = next;
        }

        public Object getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }

        public Clock getClock() {
            return clock;
        }
    }
}
