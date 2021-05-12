package Tiger01723

import Tiger01723.buildTypes.*
import Tiger01723.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01723")
    name = "Tiger01723"

    vcsRoot(Tiger01723_cVCSroot)

    buildType(Tiger01723_Hi2)
    buildType(Tiger01723_Hi3)
    buildType(Tiger01723_Hi0)
    buildType(Tiger01723_Hi1)
})
