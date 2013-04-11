'''
Created on Apr 10, 2013
py2.7
@author: erivera
'''
import xmlrpclib

s = xmlrpclib.ServerProxy('http://127.0.0.1:8081/xmlrpc')

commands={}

try:
    commands['get_complete_menu'] = s.SystemInterface.getGetCompleteMenu() # CompleteMenu
except Exception as e:
    print e
    raise SystemExit

while True:
    print 'Hello Welcome to the Python XMLRPC client'
    print '='*40
    print 'Type in "1" for CompleteMenu()'
    print '#:',
    input=raw_input()

    print '=-'*15
    if '1' == input:
        print commands['get_complete_menu']

    
    
    print '=-'*15

    if 'exit' in input:
        break

    print '\n'*2
