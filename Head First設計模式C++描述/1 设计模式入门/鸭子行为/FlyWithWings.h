#pragma once
#include "FlyBehavior.h"

//具体飞行行为
class FlyWithWings :
	public FlyBehavior
{
public:
	FlyWithWings(void);

	void fly();

	~FlyWithWings(void);
};
