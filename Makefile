shell: shell.c
	$(CC) -g -o shell shell.c

clean:
	rm -f shell mp1.tar.gz

submission: clean
	(rm -f csc256-mp1 ; tar -cvf - . | gzip > mp1.tar.gz)
