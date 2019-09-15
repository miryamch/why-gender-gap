# why-gender-gap
Demonstrates the reasoning preventing women from going into high paying jobs

# Context 
   Why is there a gender gap in programming? Or more genrally, why are there less woman in high paying jobs? 

   Many say that it's because programming (or whatever high responsibility position) is a tedious and/or solitary job, and that women are _"by nature"_ more inclined to creative occupations or professions involving human interactions. 

   Any thory based on alleged differences between men and women's brain is, in my humble opinion, bullshit. 
   I stipulate that the only factors influencing men or women in their career choices, are purely environmental, and in particular societal in nature. 

   More specifically, my belief is that women, in many societies, are less pressured than men to be high earners, and therfore have less incentive to go far-and-beyond, and invest high amounts of effort, time and energy into a challenging career. 

   I say this not to diminish women who put their family as a first priority (which also requires huge amounts of effort, time and energy, but has zero financial reward), but to unravel the belief that men who pur their career as a first priority are necessarily incredibly gifted or competent. In my experience, they are mostly average.. on average. 

# This program 
   We presents two humans with a set of job options, and asks them to pick one according to their personal validation rules. 

   There is (at the moment) a single difference between the set of rules applied by a man and a woman, which will temper the outruling of a challenging job (`R003IsNotExcessivelyHard`), if there is a high financial reward to it (`R004WillMakeYouAShitTonOfMoney`). 

   In this simplified model, the woman will always reject jobs if they are too hard, wheras men will accept them on the condition that it will make them rich. 

# Improvement suggestions 
Pull requests are welcome and future improvements could include: 
* More job options 
* Instanciate several humans and create statistics 
* Replace the linear decision flow by a point system, and add weights to validation rules so that the job with the highest score will be selected instead of the first job satisfying the rules
* Tests 
* Graphical user interface 

# Build and run 
   This is a simple maven project. Use basic maven comands to build and run, or upload as a maven project in your favorite IDE 

## build 
``` mvn install ```
## run 
``` mvn exec:java ```