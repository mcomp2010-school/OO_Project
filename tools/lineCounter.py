import subprocess
import datetime

p2 = subprocess.Popen("cloc.exe ..\src\ -no3")
p2 = subprocess.Popen("cloc.exe ..\src\ -report-file=lines"+str(datetime.datetime.now().strftime("%Y%m%dT-%H%M%S"))+".xml -no3 -xml")
p2 = subprocess.Popen("cmd.exe")
