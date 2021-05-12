package Tiger011

import Tiger011.buildTypes.*
import Tiger011.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger011")
    name = "Tiger011"

    vcsRoot(Tiger011_cVCSroot)

    buildType(Tiger011_Hi0)
    buildType(Tiger011_Hi2)
    buildType(Tiger011_Hi1)
    buildType(Tiger011_Hi3)

    subProject(Tiger01129.Project)
    subProject(Tiger01125.Project)
    subProject(Tiger01147.Project)
    subProject(Tiger01126.Project)
    subProject(Tiger01148.Project)
    subProject(Tiger01127.Project)
    subProject(Tiger01149.Project)
    subProject(Tiger01128.Project)
    subProject(Tiger01121.Project)
    subProject(Tiger01143.Project)
    subProject(Tiger01122.Project)
    subProject(Tiger01144.Project)
    subProject(Tiger01123.Project)
    subProject(Tiger01145.Project)
    subProject(Tiger01124.Project)
    subProject(Tiger01146.Project)
    subProject(Tiger01140.Project)
    subProject(Tiger01141.Project)
    subProject(Tiger01120.Project)
    subProject(Tiger01142.Project)
    subProject(Tiger01118.Project)
    subProject(Tiger01119.Project)
    subProject(Tiger01114.Project)
    subProject(Tiger01136.Project)
    subProject(Tiger01115.Project)
    subProject(Tiger01137.Project)
    subProject(Tiger01116.Project)
    subProject(Tiger01138.Project)
    subProject(Tiger01117.Project)
    subProject(Tiger01139.Project)
    subProject(Tiger01110.Project)
    subProject(Tiger01132.Project)
    subProject(Tiger01111.Project)
    subProject(Tiger01133.Project)
    subProject(Tiger01112.Project)
    subProject(Tiger01134.Project)
    subProject(Tiger01113.Project)
    subProject(Tiger01135.Project)
    subProject(Tiger01130.Project)
    subProject(Tiger01131.Project)
})
