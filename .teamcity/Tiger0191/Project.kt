package Tiger0191

import Tiger0191.buildTypes.*
import Tiger0191.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0191")
    name = "Tiger0191"

    vcsRoot(Tiger0191_cVCSroot)

    buildType(Tiger0191_Hi2)
    buildType(Tiger0191_Hi3)
    buildType(Tiger0191_Hi0)
    buildType(Tiger0191_Hi1)
})
