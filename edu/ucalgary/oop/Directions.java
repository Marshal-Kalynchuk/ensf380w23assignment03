package edu.ucalgary.oop;

public enum Directions {
    E {
        @Override
        public String toString() { return "East"; }
    },
    N {
        @Override
        public String toString() { return "North"; }
    },
    NE {
        @Override
        public String toString() { return "North East"; }
    },
    NW {
        @Override
        public String toString() { return "North West"; }
    },
    S {
        @Override
        public String toString() { return "South"; }
    },
    SE {
        @Override
        public String toString() { return "South East"; }
    },
    SW {
        @Override
        public String toString() { return "South West"; }
    },
    W {
        @Override
        public String toString() { return "West"; }
    };

    public abstract String toString();
}
