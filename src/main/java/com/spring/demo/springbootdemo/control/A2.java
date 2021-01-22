package com.spring.demo.springbootdemo.control;

class A2 {
    public void hei() throws InterruptedException {
        Object o = new Object();
        MM mm2 = new MM(1, o);
        MM2 mm3 = new MM2('A', o);

        Thread thread = new Thread(mm2);
        Thread thread1 = new Thread(mm3);
        thread.start();
        thread1.start();
        System.out.println("main");

    }

    class MM implements Runnable {
        int    num;
        Object obj;

        MM(int num, Object obk) {
            this.num = num;
            this.obj = obk;
        }

        @Override
        public void run() {
            synchronized (obj) {
                while (true) {
                    if (num > 60) {
                        return;
                    }
                    System.out.print(num++);
                    System.out.print(num++);
                    try {
                        obj.notify();
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

        }
    }

    class MM2 implements Runnable {
        int    num;
        Object obj;

        MM2(int num, Object obk) {
            this.num = num;
            this.obj = obk;
        }

        @Override
        public void run() {
            synchronized (obj) {
                while (true) {
                    if (num > 'Z') {
                        return;
                    }
                    char c = (char) num++;
                    System.out.println(c);
                    try {
                        obj.notify();
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

        }
    }




}