package Tiger01846

import Tiger01846.buildTypes.*
import Tiger01846.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01846")
    name = "Tiger01846"

    vcsRoot(Tiger01846_cVCSroot)

    buildType(Tiger01846_Hi0)
    buildType(Tiger01846_Hi1)
    buildType(Tiger01846_Hi2)
    buildType(Tiger01846_Hi3)
})
