package Tiger096

import Tiger096.buildTypes.*
import Tiger096.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger096")
    name = "Tiger096"

    vcsRoot(Tiger096_cVCSroot)

    buildType(Tiger096_Hi0)
    buildType(Tiger096_Hi1)
    buildType(Tiger096_Hi2)
    buildType(Tiger096_Hi3)
})
